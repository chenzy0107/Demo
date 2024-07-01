package com.czy.commons.util;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.util.Assert;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
public class ClassUtils {
    public static Set<Class<?>> getClassSet(String path) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(path);
        Assert.notNull(url, "url is null");
        File file = new File(url.getFile());
        File[] files = file.listFiles();
        Assert.notNull(files, "files is null");
        List<String> classNames = Arrays.stream(files).map(File::getName)
                .collect(Collectors.toList());

        String packagePath = path.replaceAll("/", ".");
        return classNames.stream().map(s -> {
            try {
                return Class.forName(packagePath + s.substring(0, s.lastIndexOf('.')));
            } catch (ClassNotFoundException e) {
                log.error("", e);
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toSet());
    }
}

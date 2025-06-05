package com.example.JsonUnitCompare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class LatestFilesFinder {
    public static Path[] findLatestTwoFiles(String dir, String prefix, String suffix) throws IOException {
        try (var stream = Files.list(Paths.get(dir))) {
            return stream
                    .filter(p -> {
                        String name = p.getFileName().toString();
                        return name.startsWith(prefix) && name.endsWith(suffix);
                    })
                    .sorted(Comparator.comparing(Path::getFileName))
                    .skip(Math.max(0, Files.list(Paths.get(dir))
                            .filter(p -> p.getFileName().toString().startsWith(prefix) && p.getFileName().toString().endsWith(suffix))
                            .count() - 2))
                    .toArray(Path[]::new);
        }
    }
}

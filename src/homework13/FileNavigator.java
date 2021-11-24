package homework13;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {

    private final HashMap<String, List<FileData>> fileNavigator;

    public FileNavigator() {
        this.fileNavigator = new HashMap<>();
    }

    public HashMap<String, List<FileData>> getFileNavigator() {
        return fileNavigator;
    }

    public void add(String path, FileData fileData) {
        if (fileData.getPath().equals(path)) {
            List<FileData> fileDataList = fileNavigator.computeIfAbsent(path, k -> new ArrayList<>());
            fileDataList.add(fileData);
        } else {
            System.out.println("Path mismatch! File skipped!\nPath: " + path + ";\nFile data: " + fileData + "\n");
        }
    }

    public List<FileData> find(String path) {
        return fileNavigator.get(path);
    }

    public List<FileData> filterBySize(long size) {
        return fileNavigator.values().stream()
                .flatMap(Collection::stream)
                .filter(f -> f.getSize() <= size)
                .collect(Collectors.toList());
    }

    public List<FileData> remove(String path) {
        return fileNavigator.remove(path);
    }

    public List<FileData> sortBySize() {
        return fileNavigator.values().stream()
                .flatMap(Collection::stream)
                .sorted(Comparator.comparing(FileData::getSize)
                        .thenComparing(FileData::getName)
                        .thenComparing(FileData::getPath))
                .collect(Collectors.toList());
    }

    public void print() {
        System.out.println("File navigator content:");
        for (Map.Entry<String, List<FileData>> entry : fileNavigator.entrySet()) {
            System.out.println(entry);
        }
    }
}

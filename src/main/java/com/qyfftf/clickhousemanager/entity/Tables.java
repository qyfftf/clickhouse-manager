package com.qyfftf.clickhousemanager.entity;

import lombok.Data;

import java.util.List;

@Data
public class Tables {
    private String database;
    private String name;
    private String uuid;
    private String engine;
    private Boolean temporary;
    private List<String> dataPaths;
    private String metadataPath;
    private String metadataModificationTime;
    private List<String> dependenciesDatabase;
    private List<String> dependenciesTable;
    private String createTableQuery;
    private String engineFull;
    private String partitionKey;
    private String sortingKey;
    private String primaryKey;
    private String samplingKey;
    private String storagePolicy;
    private Long totalRows;
    private Long totalBytes;
    private Long lifetimeRows;
    private Long lifetimeBytes;
}

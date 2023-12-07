package com.spring.core;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friendList;
    private Map<String, Integer> feeStructureMap;
    private Properties dbProperties;

    public Person() {
    }

    public Person(List<String> friendList, Map<String, Integer> feeStructureMap, Properties dbProperties) {
        this.friendList = friendList;
        this.feeStructureMap = feeStructureMap;
        this.dbProperties = dbProperties;
    }

    public List<String> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<String> friendList) {
        this.friendList = friendList;
    }

    public Map<String, Integer> getFeeStructureMap() {
        return feeStructureMap;
    }

    public void setFeeStructureMap(Map<String, Integer> feeStructureMap) {
        this.feeStructureMap = feeStructureMap;
    }

    public Properties getDbProperties() {
        return dbProperties;
    }

    public void setDbProperties(Properties dbProperties) {
        this.dbProperties = dbProperties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friendList=" + friendList +
                ", feeStructureMap=" + feeStructureMap +
                ", dbProperties=" + dbProperties +
                '}';
    }
}

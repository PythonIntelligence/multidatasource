package com.jn.ley.model;

/**
 *  图元实体类， 对应表格 cell
 * @author Lee
 */
public class Cell {
    private int id;
    /**
     * 图元对应模件id， 由新增模件成功后填
     */
    private int modelId;
    /**
     * 图元name，由内部生成的name，如 shape11
     */
    private String name;
    /**
     * 定义工具及绘图建模工具的图元列表中显示的名称，当为模件图元时，为空
     */
    private String showName;
    /**
     * 图元类型，
     */
    private String type;
    /**
     * 量测类型
     */
    private String measType;
    /**
     * 连接点信息
     */
    private String connectPoint;

    private String temporary;

    private int userId;

    public Cell() {
    }

    public Cell(int modelId, String name, String showName, String type, String measType, String connectPoint) {
        this.modelId = modelId;
        this.name = name;
        this.showName = showName;
        this.type = type;
        this.measType = measType;
        this.connectPoint = connectPoint;
    }

//    public Cell(int id, int modelId, String name, String showName, String type, String measType) {
//        this.id = id;
//        this.modelId = modelId;
//        this.name = name;
//        this.showName = showName;
//        this.type = type;
//        this.measType = measType;
//    }

    public Cell(int modelId, String name, String showName, String type, String measType, String connectPoint,
                String temporary, int userId) {
        this.modelId = modelId;
        this.name = name;
        this.showName = showName;
        this.type = type;
        this.measType = measType;
        this.connectPoint = connectPoint;
        this.temporary = temporary;
        this.userId = userId;
    }

    public Cell(int id, int modelId, String name, String showName, String type, String measType, String connectPoint,
                String temporary, int userId) {
        this.id = id;
        this.modelId = modelId;
        this.name = name;
        this.showName = showName;
        this.type = type;
        this.measType = measType;
        this.connectPoint = connectPoint;
        this.temporary = temporary;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeasType() {
        return measType;
    }

    public void setMeasType(String measType) {
        this.measType = measType;
    }

    public String getConnectPoint() {
        return connectPoint;
    }

    public void setConnectPoint(String connectPoint) {
        this.connectPoint = connectPoint;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

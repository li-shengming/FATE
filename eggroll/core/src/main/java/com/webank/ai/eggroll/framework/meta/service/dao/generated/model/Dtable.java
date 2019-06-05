/*
 * Copyright 2019 The FATE Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.ai.eggroll.framework.meta.service.dao.generated.model.model;

import java.io.Serializable;
import java.util.Date;

public class Dtable implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dtable
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.table_id
     *
     * @mbg.generated
     */
    private Long tableId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.namespace
     *
     * @mbg.generated
     */
    private String namespace;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.table_name
     *
     * @mbg.generated
     */
    private String tableName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.table_type
     *
     * @mbg.generated
     */
    private String tableType;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.total_fragments
     *
     * @mbg.generated
     */
    private Integer totalFragments;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.dispatcher
     *
     * @mbg.generated
     */
    private String dispatcher;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.serdes
     *
     * @mbg.generated
     */
    private String serdes;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.storage_version
     *
     * @mbg.generated
     */
    private Integer storageVersion;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.status
     *
     * @mbg.generated
     */
    private String status;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dtable.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.table_id
     *
     * @return the value of dtable.table_id
     * @mbg.generated
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.table_id
     *
     * @param tableId the value for dtable.table_id
     * @mbg.generated
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.namespace
     *
     * @return the value of dtable.namespace
     * @mbg.generated
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.namespace
     *
     * @param namespace the value for dtable.namespace
     * @mbg.generated
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace == null ? null : namespace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.table_name
     *
     * @return the value of dtable.table_name
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.table_name
     *
     * @param tableName the value for dtable.table_name
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.table_type
     *
     * @return the value of dtable.table_type
     * @mbg.generated
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.table_type
     *
     * @param tableType the value for dtable.table_type
     * @mbg.generated
     */
    public void setTableType(String tableType) {
        this.tableType = tableType == null ? null : tableType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.total_fragments
     *
     * @return the value of dtable.total_fragments
     * @mbg.generated
     */
    public Integer getTotalFragments() {
        return totalFragments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.total_fragments
     *
     * @param totalFragments the value for dtable.total_fragments
     * @mbg.generated
     */
    public void setTotalFragments(Integer totalFragments) {
        this.totalFragments = totalFragments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.dispatcher
     *
     * @return the value of dtable.dispatcher
     * @mbg.generated
     */
    public String getDispatcher() {
        return dispatcher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.dispatcher
     *
     * @param dispatcher the value for dtable.dispatcher
     * @mbg.generated
     */
    public void setDispatcher(String dispatcher) {
        this.dispatcher = dispatcher == null ? null : dispatcher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.serdes
     *
     * @return the value of dtable.serdes
     * @mbg.generated
     */
    public String getSerdes() {
        return serdes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.serdes
     *
     * @param serdes the value for dtable.serdes
     * @mbg.generated
     */
    public void setSerdes(String serdes) {
        this.serdes = serdes == null ? null : serdes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.storage_version
     *
     * @return the value of dtable.storage_version
     * @mbg.generated
     */
    public Integer getStorageVersion() {
        return storageVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.storage_version
     *
     * @param storageVersion the value for dtable.storage_version
     * @mbg.generated
     */
    public void setStorageVersion(Integer storageVersion) {
        this.storageVersion = storageVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.status
     *
     * @return the value of dtable.status
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.status
     *
     * @param status the value for dtable.status
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.created_at
     *
     * @return the value of dtable.created_at
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.created_at
     *
     * @param createdAt the value for dtable.created_at
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dtable.updated_at
     *
     * @return the value of dtable.updated_at
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dtable.updated_at
     *
     * @param updatedAt the value for dtable.updated_at
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dtable
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableId=").append(tableId);
        sb.append(", namespace=").append(namespace);
        sb.append(", tableName=").append(tableName);
        sb.append(", tableType=").append(tableType);
        sb.append(", totalFragments=").append(totalFragments);
        sb.append(", dispatcher=").append(dispatcher);
        sb.append(", serdes=").append(serdes);
        sb.append(", storageVersion=").append(storageVersion);
        sb.append(", status=").append(status);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dtable
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dtable other = (Dtable) that;
        return (this.getTableId() == null ? other.getTableId() == null : this.getTableId().equals(other.getTableId()))
                && (this.getNamespace() == null ? other.getNamespace() == null : this.getNamespace().equals(other.getNamespace()))
                && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
                && (this.getTableType() == null ? other.getTableType() == null : this.getTableType().equals(other.getTableType()))
                && (this.getTotalFragments() == null ? other.getTotalFragments() == null : this.getTotalFragments().equals(other.getTotalFragments()))
                && (this.getDispatcher() == null ? other.getDispatcher() == null : this.getDispatcher().equals(other.getDispatcher()))
                && (this.getSerdes() == null ? other.getSerdes() == null : this.getSerdes().equals(other.getSerdes()))
                && (this.getStorageVersion() == null ? other.getStorageVersion() == null : this.getStorageVersion().equals(other.getStorageVersion()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
                && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dtable
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableId() == null) ? 0 : getTableId().hashCode());
        result = prime * result + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getTableType() == null) ? 0 : getTableType().hashCode());
        result = prime * result + ((getTotalFragments() == null) ? 0 : getTotalFragments().hashCode());
        result = prime * result + ((getDispatcher() == null) ? 0 : getDispatcher().hashCode());
        result = prime * result + ((getSerdes() == null) ? 0 : getSerdes().hashCode());
        result = prime * result + ((getStorageVersion() == null) ? 0 : getStorageVersion().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}
package com.magoya.listener.models;

import com.fasterxml.jackson.annotation.JsonRawValue;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.Type;
import org.hibernate.type.SqlTypes;

@Data
@Entity

public class EventModel {

    @Id
    private String id;
    @Enumerated (EnumType.STRING)
    private EventType type;

    @JdbcTypeCode(SqlTypes.JSON)
    private Object data;
    @Temporal(TemporalType.TIMESTAMP)
    private Long datetime;

}















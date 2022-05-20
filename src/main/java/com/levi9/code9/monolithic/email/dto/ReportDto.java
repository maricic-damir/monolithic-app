package com.levi9.code9.monolithic.email.dto;

import lombok.Builder;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;

@Value
@Builder
public class ReportDto {

    String email;
    String type;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    OffsetDateTime startDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    OffsetDateTime endDate;
}

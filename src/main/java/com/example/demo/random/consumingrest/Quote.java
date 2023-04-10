package com.example.demo.random.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) { }

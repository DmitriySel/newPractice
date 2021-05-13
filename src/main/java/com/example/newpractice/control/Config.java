package com.example.newpractice.control;

import com.example.newpractice.model.Employee;
import com.example.newpractice.model.Person;
import com.example.newpractice.model.Student;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class Config extends JsonDeserializer<Person> {
    @Override
    public Person deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
        ObjectNode root = (ObjectNode) mapper.readTree(jsonParser);
        if("employee".equals(root.findValue("type").asText())){
            return mapper.readValue(root.toPrettyString(), Employee.class);
        } else
            return mapper.readValue(root.toPrettyString(),Student.class);
    }

}

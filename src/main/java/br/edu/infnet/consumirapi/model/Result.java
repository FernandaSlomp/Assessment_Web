package br.edu.infnet.consumirapi.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"description",
"image",
"percent"
})
@Generated("jsonschema2pojo")
public class Result {

@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;
@JsonProperty("description")
private String description;
@JsonProperty("image")
private String image;
@JsonProperty("percent")
private String percent;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("image")
public String getImage() {
return image;
}

@JsonProperty("image")
public void setImage(String image) {
this.image = image;
}

@JsonProperty("percent")
public String getPercent() {
return percent;
}

@JsonProperty("percent")
public void setPercent(String percent) {
this.percent = percent;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}

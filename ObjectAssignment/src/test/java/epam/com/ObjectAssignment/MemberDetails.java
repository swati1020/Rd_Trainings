//package epam.com.ObjectAssignment;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//"id",
//"title",
//"author"
//})
//
//public class MemberDetails {
//	@JsonProperty("id")
//	public Integer id;
//	@JsonProperty("title")
//	public String title;
//	@JsonProperty("author")
//	public String Author;
//	public Map<String,Object>additonalProperties= new HashMap<>();
//	
//	@JsonProperty("id")
//	public Integer getId() {
//		return id;
//	}
//	@JsonProperty("id")
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	
//	@JsonProperty("title")
//	public String getTitle() {
//		return title;
//	}
//	
//	@JsonProperty("title")
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	@JsonProperty("author")
//	public String getAuthor() {
//		return Author;
//	}
//	@JsonProperty("author")
//	public void setAuthor(String author) {
//		this.Author = author;
//	}
//	
//	@JsonAnyGetter
//	public Map<String, Object> getAdditonalProperties() {
//		return this.additonalProperties;
//	}
//	@JsonAnySetter
//	public void setAdditonalProperties(String name, Object value) {
//		this.additonalProperties.put(name, value);
//	}
//	@Override
//	public String toString() {
//		return String.format("id=%s ,title=%s, author=%s " +id,title,Author);
//		
//	}
//	
//
//}

package epam.com.ObjectAssignment; 

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"title",
"author"
})
public class MemberDetails {

@JsonProperty("id")
private Integer id;
@JsonProperty("title")
private String title;
@JsonProperty("author")
private String author;
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

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("author")
public String getAuthor() {
return author;
}

@JsonProperty("author")
public void setAuthor(String author) {
this.author = author;
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

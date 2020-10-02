package org.example.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DotMessage
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOT_MESSAGE_SEQ")
	@SequenceGenerator(sequenceName = "S_DOT_MESSAGE_SEQ", name = "DOT_MESSAGE_SEQ")
	private Integer id;
	private String text;
	private String tag;

	public DotMessage(String text, String tag) {
		this.text = text;
		this.tag = tag;
	}

	public DotMessage() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}


}

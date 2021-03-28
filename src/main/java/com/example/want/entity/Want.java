package com.example.want.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class Want {
	// @Idをつけた変数がプライマリーキーになる
	@Id
	// 連番が自動で振られる
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String item;
	private Integer price;
	@CreatedDate
    private LocalTime createdAt;
	@LastModifiedDate
    private LocalTime updatedAt;

	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
	public LocalTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Want [id=" + id + ", item=" + item + ", price=" + price +", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
}


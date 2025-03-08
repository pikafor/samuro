package com.samuro.samuro.dto.enums;

public enum UserRole {
    ADMIN("Админ"),
    SELLER("Продавец"),
    BUYER("Покупатель"),
    MODERATOR("Модератор"),
    SUPPORT("Поддержка"),
    GUEST("Неавторизованный");

    private String title;

    UserRole(String title) {
        this.title = title;
    }
}

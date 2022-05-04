# Эта ветвь демонстрирует, как хранить файлы в базе данных MySQL.

# 2. Настройте базу данных MySQL

Создайте базу данных MySQL с именем testdb и измените имя пользователя и пароль в src/main/resources/application.propertiesсоответствии с вашей установкой MySQL -

spring.datasource.username = <ВАШЕ ИМЯ ПОЛЬЗОВАТЕЛЯ MYSQL>
 spring.datasource.password = <ВАШ ПАРОЛЬ MYSQL>
 
 Вот и все! Доступ к приложению можно получить по адресу http://localhost:8081
 
 Картинки/файлы сохраняются в БД

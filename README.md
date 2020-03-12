# Demo project for GreetGo

	1. Как запустить проект?
	1.1. Чтобы скачать проект запускаем команду:
		git clone https://github.com/usbaitass/greetgodemo.git
	1.2. Заходим в папку:
		cd greetgodemo
	1.3. Запускаем команду:
		mvn clean compile package
	1.4.1. После сборки проекта, запускаем команду в той же папке:
		mvn spring-boot:run
	1.4.2. Или заходим в папку target и запускаем jar файл:
		java -jar demotest-0.0.1-SNAPSHOT.jar
	1.5. Ждём когда запуститься сервер. После запуска сервера заходим в браузере по адресу:
		http://locahost:8080
	1.5. И видим результат:
		'Hello world!'
	1.6. Открываем новую вкладку браузера и заходим по адресу:
		http://localhost:8080/h2-console
	1.6.1. Заходим в консоль используя следующие данные:
		Driver Class: org.h2.Driver
		JDBC URL: jdbc:h2:mem:testdb
		User Name: sa
		Password:
	1.6.2. Нажимаем на DATA в левом верхнем углу
	1.6.3. Появится sql query, нажмите Run
	1.6.4. После, нажмите Edit, и измените поле с Hello world! на ASD
	1.7. Откройте предыдущюю вкладку браузера, смотрим что сообщение обновилось.



# Makefile

install: # получаем исполняемый файл
	./gradlew clean install

run-dist: # запуск исполняемого файла
	./build/install/app/bin/app

check-updates: # проверка обновлений и зависимостей плагинов
	./gradlew dependencyUpdates

lint: #проверка на стандарт кодирования
	./gradlew checkstyleMain

project-build: #сборка проекта
	./gradlew clean build

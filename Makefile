install: # вначале будут очищены результаты предыдущей сборки и запущена новая
	make lint
	sudo ./gradlew clean install


run-dist: # запуск исполняемого файла
	sudo ./build/install/app/bin/app

check-updates: # проверять обновления зависимостей и плагинов
	sudo ./gradlew dependencyUpdates

run:
	make lint
	sudo ./gradlew run

lint: # проверка стиля кодирования
	sudo ./gradlew checkstyleMain

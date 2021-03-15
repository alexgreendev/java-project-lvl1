install: # вначале будут очищены результаты предыдущей сборки и запущена новая
	./gradlew clean install


run-dist: # запуск исполняемого файла
	./build/install/app/bin/app

check-updates: # проверять обновления зависимостей и плагинов
	./gradlew dependencyUpdates




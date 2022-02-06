# Devoir-Servlet

## Softwares et version utilisées
Tomcat 9.0.58
<br/> IntelliJ IDEA

## Demarche
1. Ce placer dans le folder de Tomcat installer
```console
foo@bar:~$ cd Tomcat
```
2. Ce placer dans le folder bin
```console
foo@bar:Tomcat$ cd bin
```
3. Faire tous les fichiers se terminant par .sh executable
```console
foo@bar:Tomcat$ chmod +x *.sh
```
4. Ouvrir IntelliJ et aller a Preferences, puis Application Servers et mettre le path où se trouve votre folder Tomcat

 ![1](https://user-images.githubusercontent.com/72801133/152678448-3691a453-7732-4387-a1ae-2d6ef828049b.png)

5. New Project > Java Enterprise > Changer project Template à Web application

![2](https://user-images.githubusercontent.com/72801133/152678575-42846de2-41b3-420d-b3ca-a8eb6715ab3a.png)

## Resultat

Apres faire Run, on aura sur http://localhost:8080/myApp/ le resultat suivant :

![3](https://user-images.githubusercontent.com/72801133/152678680-41a4f277-1654-4c93-a1c8-d32a983efffa.png)

En clickant sur "go to my servlet", on sera redirectionne à http://localhost:8080/myApp/maservlet :

![4](https://user-images.githubusercontent.com/72801133/152678731-696733ff-79e9-4bf7-9c4c-e3452cb2e1b9.png)

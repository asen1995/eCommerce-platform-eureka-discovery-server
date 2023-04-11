Docker setup:

Run this command from root of the project to build image: 

```console
docker build --build-arg VERSION=0.0.1-SNAPSHOT -t ecommerce-discovery-server-image .
```


run image on container:

```console
docker run --name discovery-server -p 8761:8761  ecommerce-discovery-server-image
```




------------------------------------------------------------------------------------------------------------------------

Kubernetes setup:


start minikube:

```console
minikube start
```

check if minikube is running:

```console
minikube status
```


```console
kubectl apply -f kubernetes/deployment.yaml
```



build docker image:

```console

docker build --build-arg VERSION=0.0.1-SNAPSHOT -t asen311/ecommerce-discovery-server-image:1.0.0 .
docker run --name discovery-server -p 8761:8761  d

```

login to docker hub:

```console
docker login
```

push image to docker hub:

```console
docker push asen311/ecommerce-discovery-server-image:1.0.0
```

create service and deployment:

```console
kubectl apply -f .\ecommerce-platform-discovery-server-service.yaml
```

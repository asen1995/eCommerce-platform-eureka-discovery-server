Docker setup:

build image: 
```console
docker build --build-arg VERSION=0.0.1-SNAPSHOT -t ecommerce-discovery-server-image .
```


run image on container:

```console
docker run --name discovery-server -p 8761:8761  ecommerce-discovery-server-image
```


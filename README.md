# How to request

## Post user
```shell
curl -X POST \
-H "Content-Type: application/json" \
-d "{ \
 \"username\": \"dddd\", \
 \"password\": \"dfdf\" \
}" http://{url}/

#result
#{
#   "id": 1
#   "username": "dddd"
#   "password": "dfdf"
#}
```

## Get user
```shell
curl http://{url}/{id}

#result
#{
#   "id": 1
#   "username": "dddd"
#   "password": "dfdf"
#}
```

## Put user
```shell
curl -X PUT \
-H "Content-Type: application/json" \
-d "{ \
 \"username\": \"dddd\", \
 \"password\": \"dfddddf\" \
}" http://{url}/{id}

#result
#{
#   "id": 1
#   "username": "dddd"
#   "password": "dfddddf"
#}
```

## Delete user
```shell
curl -X DELETE http://{url}/{id}

#result: user id {id} deleted
```
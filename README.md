# How to request

## Post user
```shell
curl -X POST \
-H "Content-Type: application/json" \
-d "{ \
 \"username\":\"dddd\", \
 \"password\": \"dfdf\" \
} http://??????????/"

#result
#{
#   "id": 1
#   "username": "dddd"
#   "password": "dfdf"
#}
```

## Get user
```shell
curl http://??????????/{id}

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
 \"username\":\"dddd\", \
 \"password\": \"dfddddf\" \
} http://??????????/{id}"

#result
#{
#   "id": 1
#   "username": "dddd"
#   "password": "dfddddf"
#}
```

## Delete user
```shell
curl -X DELETE http://??????????/{id}

#result: user id {id} deleted
```
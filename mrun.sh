echo "Clearing Port 8080"
echo "------------------"
fuser -k 8080/tcp
fuser -k 8080/tcp
echo "Port 8080 cleared"
echo "-----------------"
echo "Running with Maven"
echo "------------------"
./mvnw spring-boot:run
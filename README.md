# Lambda_api_gateway

# Description of application:
This application helps users to find the first repeated word in a string, which can be an entire book.

## Screenshot of post man:

![app_screenshot](https://raw.githubusercontent.com/sadhikari07/lambda_api_gateway/master/repeatedWordLambdaAPI.png)

## Link to the deployed site: 
https://xw86fzyns2.execute-api.us-east-1.amazonaws.com/repeatFinder

## Instructions on running on postman:
On postman, create a get request by using the above mentioned url, and entering parameters as follows:
- key: inputString
- value: "your string"
  
 From web browser enter the url: https://xw86fzyns2.execute-api.us-east-1.amazonaws.com/repeatFinder?inputString=
 followed by your string.
 Example: https://xw86fzyns2.execute-api.us-east-1.amazonaws.com/repeatFinder?inputString=hello hi bye bye
  
## Referemnces:
 - Michelle's class lecture

## Issues faced: 
- Error while parsing json
- Trying to implement the hash table that was created on DSA

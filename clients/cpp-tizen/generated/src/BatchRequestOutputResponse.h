/*
 * BatchRequestOutput_response.h
 *
 * 
 */

#ifndef _BatchRequestOutput_response_H_
#define _BatchRequestOutput_response_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BatchRequestOutput_response : public Object {
public:
	/*! \brief Constructor.
	 */
	BatchRequestOutput_response();
	BatchRequestOutput_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BatchRequestOutput_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The HTTP status code of the response
	 */
	int getStatusCode();

	/*! \brief Set The HTTP status code of the response
	 */
	void setStatusCode(int  status_code);
	/*! \brief Get An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
	 */
	std::string getRequestId();

	/*! \brief Set An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
	 */
	void setRequestId(std::string  request_id);
	/*! \brief Get The JSON body of the response
	 */
	std::string getBody();

	/*! \brief Set The JSON body of the response
	 */
	void setBody(std::string  body);

private:
	int status_code;
	std::string request_id;
	std::string body;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BatchRequestOutput_response_H_ */


/*
 * BatchRequestOutput_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BatchRequestOutput_response_H_
#define TINY_CPP_CLIENT_BatchRequestOutput_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BatchRequestOutput_response{
public:

    /*! \brief Constructor.
	 */
    BatchRequestOutput_response();
    BatchRequestOutput_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BatchRequestOutput_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	Object getBody();

	/*! \brief Set The JSON body of the response
	 */
	void setBody(Object  body);


    private:
    int status_code{};
    std::string request_id{};
    Object body;
};
}

#endif /* TINY_CPP_CLIENT_BatchRequestOutput_response_H_ */

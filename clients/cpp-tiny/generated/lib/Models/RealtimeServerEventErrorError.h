
/*
 * RealtimeServerEventError_error.h
 *
 * Details of the error.
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventError_error_H_
#define TINY_CPP_CLIENT_RealtimeServerEventError_error_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Details of the error.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventError_error{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventError_error();
    RealtimeServerEventError_error(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventError_error();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
	 */
	std::string getType();

	/*! \brief Set The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
	 */
	void setType(std::string  type);
	/*! \brief Get Error code, if any.
	 */
	std::string getCode();

	/*! \brief Set Error code, if any.
	 */
	void setCode(std::string  code);
	/*! \brief Get A human-readable error message.
	 */
	std::string getMessage();

	/*! \brief Set A human-readable error message.
	 */
	void setMessage(std::string  message);
	/*! \brief Get Parameter related to the error, if any.
	 */
	std::string getParam();

	/*! \brief Set Parameter related to the error, if any.
	 */
	void setParam(std::string  param);
	/*! \brief Get The event_id of the client event that caused the error, if applicable. 
	 */
	std::string getEventId();

	/*! \brief Set The event_id of the client event that caused the error, if applicable. 
	 */
	void setEventId(std::string  event_id);


    private:
    std::string type{};
    std::string code{};
    std::string message{};
    std::string param{};
    std::string event_id{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventError_error_H_ */

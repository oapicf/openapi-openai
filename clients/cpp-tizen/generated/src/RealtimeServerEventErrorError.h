/*
 * RealtimeServerEventError_error.h
 *
 * Details of the error.
 */

#ifndef _RealtimeServerEventError_error_H_
#define _RealtimeServerEventError_error_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details of the error.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventError_error : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventError_error();
	RealtimeServerEventError_error(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventError_error();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	std::string code;
	std::string message;
	std::string param;
	std::string event_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventError_error_H_ */

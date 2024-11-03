/*
 * RunStepObject_last_error.h
 *
 * The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
 */

#ifndef _RunStepObject_last_error_H_
#define _RunStepObject_last_error_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The last error associated with this run step. Will be `null` if there are no errors.
 *
 *  \ingroup Models
 *
 */

class RunStepObject_last_error : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepObject_last_error();
	RunStepObject_last_error(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepObject_last_error();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get One of `server_error` or `rate_limit_exceeded`.
	 */
	std::string getCode();

	/*! \brief Set One of `server_error` or `rate_limit_exceeded`.
	 */
	void setCode(std::string  code);
	/*! \brief Get A human-readable description of the error.
	 */
	std::string getMessage();

	/*! \brief Set A human-readable description of the error.
	 */
	void setMessage(std::string  message);

private:
	std::string code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepObject_last_error_H_ */

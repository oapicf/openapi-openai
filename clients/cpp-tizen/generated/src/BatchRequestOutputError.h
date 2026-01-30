/*
 * BatchRequestOutput_error.h
 *
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 */

#ifndef _BatchRequestOutput_error_H_
#define _BatchRequestOutput_error_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 *
 *  \ingroup Models
 *
 */

class BatchRequestOutput_error : public Object {
public:
	/*! \brief Constructor.
	 */
	BatchRequestOutput_error();
	BatchRequestOutput_error(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BatchRequestOutput_error();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A machine-readable error code.
	 */
	std::string getCode();

	/*! \brief Set A machine-readable error code.
	 */
	void setCode(std::string  code);
	/*! \brief Get A human-readable error message.
	 */
	std::string getMessage();

	/*! \brief Set A human-readable error message.
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

#endif /* _BatchRequestOutput_error_H_ */

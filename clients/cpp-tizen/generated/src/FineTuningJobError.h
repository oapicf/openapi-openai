/*
 * FineTuningJob_error.h
 *
 * For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
 */

#ifndef _FineTuningJob_error_H_
#define _FineTuningJob_error_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 *
 *  \ingroup Models
 *
 */

class FineTuningJob_error : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuningJob_error();
	FineTuningJob_error(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuningJob_error();

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
	/*! \brief Get The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
	 */
	std::string getParam();

	/*! \brief Set The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
	 */
	void setParam(std::string  param);

private:
	std::string code;
	std::string message;
	std::string param;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuningJob_error_H_ */

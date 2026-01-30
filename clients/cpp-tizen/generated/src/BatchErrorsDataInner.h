/*
 * Batch_errors_data_inner.h
 *
 * 
 */

#ifndef _Batch_errors_data_inner_H_
#define _Batch_errors_data_inner_H_


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

class Batch_errors_data_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Batch_errors_data_inner();
	Batch_errors_data_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Batch_errors_data_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get An error code identifying the error type.
	 */
	std::string getCode();

	/*! \brief Set An error code identifying the error type.
	 */
	void setCode(std::string  code);
	/*! \brief Get A human-readable message providing more details about the error.
	 */
	std::string getMessage();

	/*! \brief Set A human-readable message providing more details about the error.
	 */
	void setMessage(std::string  message);
	/*! \brief Get The name of the parameter that caused the error, if applicable.
	 */
	std::string getParam();

	/*! \brief Set The name of the parameter that caused the error, if applicable.
	 */
	void setParam(std::string  param);
	/*! \brief Get The line number of the input file where the error occurred, if applicable.
	 */
	int getLine();

	/*! \brief Set The line number of the input file where the error occurred, if applicable.
	 */
	void setLine(int  line);

private:
	std::string code;
	std::string message;
	std::string param;
	int line;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Batch_errors_data_inner_H_ */

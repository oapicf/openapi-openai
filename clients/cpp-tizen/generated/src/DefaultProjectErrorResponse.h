/*
 * DefaultProjectErrorResponse.h
 *
 * 
 */

#ifndef _DefaultProjectErrorResponse_H_
#define _DefaultProjectErrorResponse_H_


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

class DefaultProjectErrorResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DefaultProjectErrorResponse();
	DefaultProjectErrorResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DefaultProjectErrorResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);

private:
	int code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DefaultProjectErrorResponse_H_ */

/*
 * RealtimeResponse_status_details_error.h
 *
 * A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;. 
 */

#ifndef _RealtimeResponse_status_details_error_H_
#define _RealtimeResponse_status_details_error_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponse_status_details_error : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeResponse_status_details_error();
	RealtimeResponse_status_details_error(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeResponse_status_details_error();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of error.
	 */
	std::string getType();

	/*! \brief Set The type of error.
	 */
	void setType(std::string  type);
	/*! \brief Get Error code, if any.
	 */
	std::string getCode();

	/*! \brief Set Error code, if any.
	 */
	void setCode(std::string  code);

private:
	std::string type;
	std::string code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeResponse_status_details_error_H_ */

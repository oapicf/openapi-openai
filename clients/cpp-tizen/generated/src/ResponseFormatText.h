/*
 * ResponseFormatText.h
 *
 * 
 */

#ifndef _ResponseFormatText_H_
#define _ResponseFormatText_H_


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

class ResponseFormatText : public Object {
public:
	/*! \brief Constructor.
	 */
	ResponseFormatText();
	ResponseFormatText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ResponseFormatText();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of response format being defined: `text`
	 */
	std::string getType();

	/*! \brief Set The type of response format being defined: `text`
	 */
	void setType(std::string  type);

private:
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ResponseFormatText_H_ */

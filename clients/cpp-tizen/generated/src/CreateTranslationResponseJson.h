/*
 * CreateTranslationResponseJson.h
 *
 * 
 */

#ifndef _CreateTranslationResponseJson_H_
#define _CreateTranslationResponseJson_H_


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

class CreateTranslationResponseJson : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateTranslationResponseJson();
	CreateTranslationResponseJson(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateTranslationResponseJson();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);

private:
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateTranslationResponseJson_H_ */

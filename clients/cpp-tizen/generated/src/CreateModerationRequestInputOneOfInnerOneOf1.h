/*
 * CreateModerationRequest_input_oneOf_inner_oneOf_1.h
 *
 * An object describing text to classify.
 */

#ifndef _CreateModerationRequest_input_oneOf_inner_oneOf_1_H_
#define _CreateModerationRequest_input_oneOf_inner_oneOf_1_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object describing text to classify.
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input_oneOf_inner_oneOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationRequest_input_oneOf_inner_oneOf_1();
	CreateModerationRequest_input_oneOf_inner_oneOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationRequest_input_oneOf_inner_oneOf_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `text`.
	 */
	std::string getType();

	/*! \brief Set Always `text`.
	 */
	void setType(std::string  type);
	/*! \brief Get A string of text to classify.
	 */
	std::string getText();

	/*! \brief Set A string of text to classify.
	 */
	void setText(std::string  text);

private:
	std::string type;
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationRequest_input_oneOf_inner_oneOf_1_H_ */

/*
 * AssistantsApiResponseFormat.h
 *
 * An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. 
 */

#ifndef _AssistantsApiResponseFormat_H_
#define _AssistantsApiResponseFormat_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
 *
 *  \ingroup Models
 *
 */

class AssistantsApiResponseFormat : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantsApiResponseFormat();
	AssistantsApiResponseFormat(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantsApiResponseFormat();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Must be one of `text` or `json_object`.
	 */
	std::string getType();

	/*! \brief Set Must be one of `text` or `json_object`.
	 */
	void setType(std::string  type);

private:
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantsApiResponseFormat_H_ */

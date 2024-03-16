/*
 * CreateModerationRequest_input.h
 *
 * The input text to classify
 */

#ifndef _CreateModerationRequest_input_H_
#define _CreateModerationRequest_input_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The input text to classify
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationRequest_input();
	CreateModerationRequest_input(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationRequest_input();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationRequest_input_H_ */

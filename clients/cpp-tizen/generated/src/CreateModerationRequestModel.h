/*
 * CreateModerationRequest_model.h
 *
 * The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
 */

#ifndef _CreateModerationRequest_model_H_
#define _CreateModerationRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationRequest_model();
	CreateModerationRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationRequest_model();

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

#endif /* _CreateModerationRequest_model_H_ */

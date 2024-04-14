/*
 * CreateRunRequest_model.h
 *
 * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
 */

#ifndef _CreateRunRequest_model_H_
#define _CreateRunRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
 *
 *  \ingroup Models
 *
 */

class CreateRunRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateRunRequest_model();
	CreateRunRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateRunRequest_model();

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

#endif /* _CreateRunRequest_model_H_ */

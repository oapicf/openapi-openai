/*
 * CreateFineTuningJobRequest_integrations_inner_type.h
 *
 * The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
 */

#ifndef _CreateFineTuningJobRequest_integrations_inner_type_H_
#define _CreateFineTuningJobRequest_integrations_inner_type_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_integrations_inner_type : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuningJobRequest_integrations_inner_type();
	CreateFineTuningJobRequest_integrations_inner_type(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuningJobRequest_integrations_inner_type();

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

#endif /* _CreateFineTuningJobRequest_integrations_inner_type_H_ */

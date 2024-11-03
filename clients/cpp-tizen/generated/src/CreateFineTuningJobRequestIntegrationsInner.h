/*
 * CreateFineTuningJobRequest_integrations_inner.h
 *
 * 
 */

#ifndef _CreateFineTuningJobRequest_integrations_inner_H_
#define _CreateFineTuningJobRequest_integrations_inner_H_


#include <string>
#include "CreateFineTuningJobRequest_integrations_inner_type.h"
#include "CreateFineTuningJobRequest_integrations_inner_wandb.h"
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

class CreateFineTuningJobRequest_integrations_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuningJobRequest_integrations_inner();
	CreateFineTuningJobRequest_integrations_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuningJobRequest_integrations_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CreateFineTuningJobRequest_integrations_inner_type getType();

	/*! \brief Set 
	 */
	void setType(CreateFineTuningJobRequest_integrations_inner_type  type);
	/*! \brief Get 
	 */
	CreateFineTuningJobRequest_integrations_inner_wandb getWandb();

	/*! \brief Set 
	 */
	void setWandb(CreateFineTuningJobRequest_integrations_inner_wandb  wandb);

private:
	CreateFineTuningJobRequest_integrations_inner_type type;
	CreateFineTuningJobRequest_integrations_inner_wandb wandb;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateFineTuningJobRequest_integrations_inner_H_ */

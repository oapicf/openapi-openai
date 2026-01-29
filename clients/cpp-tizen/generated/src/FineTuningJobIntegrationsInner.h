/*
 * FineTuningJob_integrations_inner.h
 *
 * 
 */

#ifndef _FineTuningJob_integrations_inner_H_
#define _FineTuningJob_integrations_inner_H_


#include <string>
#include "CreateFineTuningJobRequest_integrations_inner_wandb.h"
#include "FineTuningIntegration.h"
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

class FineTuningJob_integrations_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuningJob_integrations_inner();
	FineTuningJob_integrations_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuningJob_integrations_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of the integration being enabled for the fine-tuning job
	 */
	std::string getType();

	/*! \brief Set The type of the integration being enabled for the fine-tuning job
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	CreateFineTuningJobRequest_integrations_inner_wandb getWandb();

	/*! \brief Set 
	 */
	void setWandb(CreateFineTuningJobRequest_integrations_inner_wandb  wandb);

private:
	std::string type;
	CreateFineTuningJobRequest_integrations_inner_wandb wandb;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuningJob_integrations_inner_H_ */

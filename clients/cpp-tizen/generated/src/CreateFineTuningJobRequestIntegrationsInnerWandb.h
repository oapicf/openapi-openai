/*
 * CreateFineTuningJobRequest_integrations_inner_wandb.h
 *
 * The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
 */

#ifndef _CreateFineTuningJobRequest_integrations_inner_wandb_H_
#define _CreateFineTuningJobRequest_integrations_inner_wandb_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_integrations_inner_wandb : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuningJobRequest_integrations_inner_wandb();
	CreateFineTuningJobRequest_integrations_inner_wandb(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuningJobRequest_integrations_inner_wandb();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the project that the new run will be created under. 
	 */
	std::string getProject();

	/*! \brief Set The name of the project that the new run will be created under. 
	 */
	void setProject(std::string  project);
	/*! \brief Get A display name to set for the run. If not set, we will use the Job ID as the name. 
	 */
	std::string getName();

	/*! \brief Set A display name to set for the run. If not set, we will use the Job ID as the name. 
	 */
	void setName(std::string  name);
	/*! \brief Get The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
	 */
	std::string getEntity();

	/*! \brief Set The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
	 */
	void setEntity(std::string  entity);
	/*! \brief Get A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
	 */
	std::list<std::string> getTags();

	/*! \brief Set A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
	 */
	void setTags(std::list <std::string> tags);

private:
	std::string project;
	std::string name;
	std::string entity;
	std::list <std::string>tags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateFineTuningJobRequest_integrations_inner_wandb_H_ */
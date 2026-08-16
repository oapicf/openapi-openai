
/*
 * FineTuningIntegration.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_FineTuningIntegration_H_
#define TINY_CPP_CLIENT_FineTuningIntegration_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateFineTuningJobRequest_integrations_inner_wandb.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class FineTuningIntegration{
public:

    /*! \brief Constructor.
	 */
    FineTuningIntegration();
    FineTuningIntegration(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuningIntegration();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    CreateFineTuningJobRequest_integrations_inner_wandb wandb;
};
}

#endif /* TINY_CPP_CLIENT_FineTuningIntegration_H_ */

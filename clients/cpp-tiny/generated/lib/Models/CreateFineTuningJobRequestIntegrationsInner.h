
/*
 * CreateFineTuningJobRequest_integrations_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateFineTuningJobRequest_integrations_inner_H_
#define TINY_CPP_CLIENT_CreateFineTuningJobRequest_integrations_inner_H_


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

class CreateFineTuningJobRequest_integrations_inner{
public:

    /*! \brief Constructor.
	 */
    CreateFineTuningJobRequest_integrations_inner();
    CreateFineTuningJobRequest_integrations_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateFineTuningJobRequest_integrations_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
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

#endif /* TINY_CPP_CLIENT_CreateFineTuningJobRequest_integrations_inner_H_ */

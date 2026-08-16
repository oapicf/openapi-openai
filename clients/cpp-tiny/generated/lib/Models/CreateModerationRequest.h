
/*
 * CreateModerationRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateModerationRequest_H_
#define TINY_CPP_CLIENT_CreateModerationRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateModerationRequest_input.h"
#include "CreateModerationRequest_model.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest{
public:

    /*! \brief Constructor.
	 */
    CreateModerationRequest();
    CreateModerationRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CreateModerationRequest_input getInput();

	/*! \brief Set 
	 */
	void setInput(CreateModerationRequest_input  input);
	/*! \brief Get 
	 */
	CreateModerationRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateModerationRequest_model  model);


    private:
    CreateModerationRequest_input input;
    CreateModerationRequest_model model;
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationRequest_H_ */

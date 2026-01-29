/*
 * CreateModerationRequest.h
 *
 * 
 */

#ifndef _CreateModerationRequest_H_
#define _CreateModerationRequest_H_


#include <string>
#include "CreateModerationRequest_input.h"
#include "CreateModerationRequest_model.h"
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

class CreateModerationRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationRequest();
	CreateModerationRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationRequest_H_ */

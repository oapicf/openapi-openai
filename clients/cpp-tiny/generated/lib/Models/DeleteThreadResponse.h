
/*
 * DeleteThreadResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeleteThreadResponse_H_
#define TINY_CPP_CLIENT_DeleteThreadResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteThreadResponse{
public:

    /*! \brief Constructor.
	 */
    DeleteThreadResponse();
    DeleteThreadResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteThreadResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	bool isDeleted();

	/*! \brief Set 
	 */
	void setDeleted(bool  deleted);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);


    private:
    std::string id{};
    bool deleted{};
    std::string object{};
};
}

#endif /* TINY_CPP_CLIENT_DeleteThreadResponse_H_ */

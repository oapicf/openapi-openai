
/*
 * CreateModerationResponse_results_inner_categories.h
 *
 * A list of the categories, and whether they are flagged or not.
 */

#ifndef TINY_CPP_CLIENT_CreateModerationResponse_results_inner_categories_H_
#define TINY_CPP_CLIENT_CreateModerationResponse_results_inner_categories_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A list of the categories, and whether they are flagged or not.
 *
 *  \ingroup Models
 *
 */

class CreateModerationResponse_results_inner_categories{
public:

    /*! \brief Constructor.
	 */
    CreateModerationResponse_results_inner_categories();
    CreateModerationResponse_results_inner_categories(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationResponse_results_inner_categories();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
	 */
	bool isHate();

	/*! \brief Set Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
	 */
	void setHate(bool  hate);
	/*! \brief Get Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
	 */
	bool isHatethreatening();

	/*! \brief Set Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
	 */
	void setHatethreatening(bool  hatethreatening);
	/*! \brief Get Content that expresses, incites, or promotes harassing language towards any target.
	 */
	bool isHarassment();

	/*! \brief Set Content that expresses, incites, or promotes harassing language towards any target.
	 */
	void setHarassment(bool  harassment);
	/*! \brief Get Harassment content that also includes violence or serious harm towards any target.
	 */
	bool isHarassmentthreatening();

	/*! \brief Set Harassment content that also includes violence or serious harm towards any target.
	 */
	void setHarassmentthreatening(bool  harassmentthreatening);
	/*! \brief Get Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
	 */
	bool isIllicit();

	/*! \brief Set Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
	 */
	void setIllicit(bool  illicit);
	/*! \brief Get Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
	 */
	bool isIllicitviolent();

	/*! \brief Set Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
	 */
	void setIllicitviolent(bool  illicitviolent);
	/*! \brief Get Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
	 */
	bool isSelfharm();

	/*! \brief Set Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
	 */
	void setSelfharm(bool  selfharm);
	/*! \brief Get Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
	 */
	bool isSelfharmintent();

	/*! \brief Set Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
	 */
	void setSelfharmintent(bool  selfharmintent);
	/*! \brief Get Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
	 */
	bool isSelfharminstructions();

	/*! \brief Set Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
	 */
	void setSelfharminstructions(bool  selfharminstructions);
	/*! \brief Get Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
	 */
	bool isSexual();

	/*! \brief Set Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
	 */
	void setSexual(bool  sexual);
	/*! \brief Get Sexual content that includes an individual who is under 18 years old.
	 */
	bool isSexualminors();

	/*! \brief Set Sexual content that includes an individual who is under 18 years old.
	 */
	void setSexualminors(bool  sexualminors);
	/*! \brief Get Content that depicts death, violence, or physical injury.
	 */
	bool isViolence();

	/*! \brief Set Content that depicts death, violence, or physical injury.
	 */
	void setViolence(bool  violence);
	/*! \brief Get Content that depicts death, violence, or physical injury in graphic detail.
	 */
	bool isViolencegraphic();

	/*! \brief Set Content that depicts death, violence, or physical injury in graphic detail.
	 */
	void setViolencegraphic(bool  violencegraphic);


    private:
    bool hate{};
    bool hatethreatening{};
    bool harassment{};
    bool harassmentthreatening{};
    bool illicit{};
    bool illicitviolent{};
    bool selfharm{};
    bool selfharmintent{};
    bool selfharminstructions{};
    bool sexual{};
    bool sexualminors{};
    bool violence{};
    bool violencegraphic{};
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationResponse_results_inner_categories_H_ */

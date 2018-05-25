package pokemon.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	
	private void updatePokedexInfo(int index)
	{
		//Update Basic Text fields
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
//		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		//Update Text areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}

	public PokemonPanel(PokemonController appController)
	{
		super();
		setBackground(new Color(220, 20, 60));
		this.appController = appController;
		
		appLayout = new SpringLayout();
				
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		nameField.setForeground(new Color(0, 0, 0));
		nameField.setBackground(new Color(255, 255, 255));
		numberField = new JTextField("##");
		numberField.setBackground(new Color(255, 255, 255));
		attackField = new JTextField("ap");
		attackField.setBackground(new Color(255, 255, 255));
		healthField = new JTextField("hp");
		healthField.setBackground(new Color(255, 255, 255));
		modifierField = new JTextField("mod");
		modifierField.setBackground(new Color(255, 255, 255));
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		healthLabel = new JLabel("health");
		modifierLabel = new JLabel("modifier");
		pokedexDropdown = new JComboBox();
		pokedexDropdown.setBackground(new Color(255, 255, 255));
		clearButton = new JButton("clear");
		clearButton.setBackground(new Color(255, 255, 255));
		saveButton = new JButton("save");
		saveButton.setBackground(new Color(255, 255, 255));
		descriptionArea = new JTextArea(5, 10);
		descriptionArea.setBackground(new Color(220, 20, 60));
		typeArea = new JTextArea(4, 15);
		typeArea.setBackground(new Color(220, 20, 60));
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		thirdType.setForeground(new Color(0, 0, 0));
		thirdType.setBackground(new Color(255, 255, 255));
		fourthType = new JPanel();
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
//		thirdType.setSize(50, 50);
//		fourthType.setSize(50, 50);
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		firstType.setBackground(Color.WHITE);
		secondType.setBackground(Color.WHITE);
		//Change this to match your 3 minimum Types in your pokedex
		if(types[0].equals("Grass"))
		{
			firstType.setBackground (new Color(34, 139, 34));
		}
		else if (types[0].equals("Ground"))
		{
			firstType.setBackground (new Color(139, 69, 19));
		}
		else if (types[0].equals("Psychic"))
		{
			firstType.setBackground (new Color(255, 20, 147));
		}
		else if (types[0].equals("Water"))
		{
			firstType.setBackground (new Color(0, 0, 255));
		}
		else if (types[0].equals("Bug"))
		{
			firstType.setBackground (new Color(0, 255, 0));
		}
		else if (types[0].equals("Dragon"))
		{
			firstType.setBackground (new Color(25, 25, 112));
		}
		else if (types[0].equals("Ice"))
		{
			firstType.setBackground (new Color(175, 238, 238));
		}
		else if (types[0].equals("Fighting"))
		{
			firstType.setBackground (new Color(139, 0, 0));
		}
		else if (types[0].equals("Fire"))
		{
			firstType.setBackground (new Color(255, 69, 0));
		}
		else if (types[0].equals("Flying"))
		{
			firstType.setBackground (new Color(147, 112, 219));
		}
		else if (types[0].equals("Ghost"))
		{
			firstType.setBackground (new Color(106, 90, 205));
		}
		else if (types[0].equals("Electric"))
		{
			firstType.setBackground (new Color(255, 255, 0));
		}
		else if (types[0].equals("Normal"))
		{
			firstType.setBackground (new Color(169, 169, 169));
		}
		else if (types[0].equals("Poison"))
		{
			firstType.setBackground (new Color(128, 0, 128));
		}
		else if (types[0].equals("Rock"))
		{
			firstType.setBackground (new Color(205, 133, 63));
		}
		else if (types[0].equals("Fairy"))
		{
			firstType.setBackground (new Color(255, 192, 203));
		}
		
		if (types.length > 1)
		{
//			if (types[1].equals("Psychic"))
//			{
//				secondType.setBackground(new Color(255, 192, 203));
//			}
//			else if (types[1].equals("Grass"))
//			{
//				secondType.setBackground (new Color(34, 139, 34));
//			}
			if(types[1].equals("Grass"))
			{
				secondType.setBackground (new Color(34, 139, 34));
			}
			else if (types[1].equals("Ground"))
			{
				secondType.setBackground (new Color(139, 69, 19));
			}
			else if (types[1].equals("Psychic"))
			{
				secondType.setBackground (new Color(255, 20, 147));
			}
			else if (types[1].equals("Water"))
			{
				secondType.setBackground (new Color(0, 0, 255));
			}
			else if (types[1].equals("Bug"))
			{
				secondType.setBackground (new Color(0, 255, 0));
			}
			else if (types[1].equals("Dragon"))
			{
				secondType.setBackground (new Color(25, 25, 112));
			}
			else if (types[1].equals("Ice"))
			{
				secondType.setBackground (new Color(175, 238, 238));
			}
			else if (types[1].equals("Fighting"))
			{
				secondType.setBackground (new Color(139, 0, 0));
			}
			else if (types[1].equals("Fire"))
			{
				secondType.setBackground (new Color(255, 69, 0));
			}
			else if (types[1].equals("Flying"))
			{
				secondType.setBackground (new Color(147, 112, 219));
			}
			else if (types[1].equals("Ghost"))
			{
				secondType.setBackground (new Color(106, 90, 205));
			}
			else if (types[1].equals("Electric"))
			{
				secondType.setBackground (new Color(255, 255, 0));
			}
			else if (types[1].equals("Normal"))
			{
				secondType.setBackground (new Color(169, 169, 169));
			}
			else if (types[1].equals("Poison"))
			{
				secondType.setBackground (new Color(128, 0, 128));
			}
			else if (types[1].equals("Rock"))
			{
				secondType.setBackground (new Color(205, 133, 63));
			}
			else if (types[1].equals("Fairy"))
			{
				secondType.setBackground (new Color(255, 192, 203));
			}
			//...continue as above
			
		}
		
	}
	// Set this for each of the different type panels
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
//		this.add(modifierField);
		this.add(iconLabel);
		this.add(nameLabel);
		this.add(evolvableLabel);
		this.add(numberLabel);
		this.add(attackLabel);
		this.add(healthLabel);
//		this.add(modifierLabel);
		this.add(pokedexDropdown);
//		this.add(clearButton);
//		this.add(saveButton);
//		this.add(descriptionArea);
		this.add(typeArea);
		this.add(firstType);
		this.add(secondType);
//		this.add(thirdType);
//		this.add(fourthType);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, -1, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -6, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, clearButton);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 5, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 9, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 39, SpringLayout.SOUTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -6, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 6, SpringLayout.EAST, typeArea);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, 0, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, thirdType, 0, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, thirdType, 6, SpringLayout.EAST, typeArea);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 5, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -105, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, -64, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstType, -90, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, -6, SpringLayout.WEST, firstType);
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 0, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 6, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 6, SpringLayout.EAST, typeArea);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, -48, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, secondType, -90, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, -21, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 41, SpringLayout.EAST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 0, SpringLayout.NORTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 6, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
	}
	
	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(appController.isValidInteger(attackField.getText()) && appController.isValidInteger(healthField.getText())
						&& appController.isValidDouble(modifierField.getText()))
				{
					int selected = pokedexDropdown.getSelectedIndex();
					int health = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modifier = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolvable = evolvableBox.isSelected();
					
					//Send to the Controller to modify the Pokemon
					appController.updateSelected(selected, health, attack, evolvable, modifier, name);
				}
			}
		});
		
	}
	
}
